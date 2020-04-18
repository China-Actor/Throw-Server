#!/bin/sh

SERVER_NAME=`pwd`/xunyuansword

STDOUT=/dev/null
STDERR=/dev/null

CLASS_NAME=com.playmore.xysword.StartServer
CLASS_CLOSE_NAME=com.playmore.xysword.CloseServer

#JAVA_HOME=/usr/lib/jvm/java-1.7.0
JAVA_HOME=$3

PID=`pwd`/xunyuansword.pid

CLASS_PATH=./

#ARGS=http://192.168.2.4:8090/remoteInvoke
SERVER_PATH=`pwd`/
ARGS=$1

PROC_NUM=`ps axu|grep java|grep ${SERVER_PATH}|grep -v grep|wc -l`

JARS=(`ls |grep .jar`)
DIRNUM=${#JARS[@]}

index=0
while [ $index -lt $DIRNUM ]
do
  CLASS_PATH=$CLASS_PATH:${JARS[$index]}
  let "index= $index + 1"
done

JAVA_OPTS="-Xmx4096m -Xms4096m -Xmn2g -Xss256k  -XX:PermSize=512m -XX:MaxPermSize=1024m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./oom.hprof -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:MaxGCPauseMillis=50 -XX:GCPauseIntervalMillis=200 -XX:SurvivorRatio=6 -Xloggc:logs/gc.log"

start()
{
if [ $PROC_NUM -eq 1 ]
        then
                echo
                echo The $SERVER_NAME Server already Started!
                echo
        else
                echo
                echo Start The $SERVER_NAME Server....
                echo 
		        echo $CLASS_PATH
                $JAVA_HOME/bin/java -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.EPollSelectorProvider $JAVA_OPTS -classpath $CLASS_PATH $CLASS_NAME $ARGS $SERVER_PATH>system.out 2>&1 &
                echo $!>$PID
                echo The $SERVER_NAME Server Started!
                echo
                    
fi
}

stop()
{
if [ $PROC_NUM -eq 1 ]
        then
                echo
                echo Stop The $SERVER_NAME Server....
                echo
                TPID=`cat $PID`
                 echo 
                        echo $CLASS_PATH
   
                $JAVA_HOME/bin/java -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.EPollSelectorProvider -classpath $CLASS_PATH $CLASS_CLOSE_NAME $ARGS >>system.out 2>&1 &
 
                #sleep 30
                               
        else
                echo
                echo The $SERVER_NAME Server already Stoped!
                echo
fi
}



status()
{
echo
if [ $PROC_NUM -eq 1 ]
        then
                TPID=`cat $PID`
                STATUS=`ps -p $TPID|grep java | awk '{print $1}'`
                if test $STATUS
                        then
                                echo "The $SERVER_NAME Server Running($TPID)!"
                                echo
                        else
                                echo The $SERVER_NAME Server NOT Running!
                                rm $PID
                                echo
                fi
        else
                echo
                echo The $SERVER_NAME Server NOT Running!
                echo
fi
}

case "$2" in
'start')
                status
		start
        ;;
'stop')
                stop
        ;;
'restart')
		stop
		start
	;;
'status')
                status
        ;;
*)
        echo
        echo
        echo "Usage: $0 {status | start | stop }"
        echo
        echo Status of $SERVER_NAME Servers ......
                status
        ;;
esac
exit 0
