#!/bin/sh

dir=/app/server
PID=/app/server/logicserver/xunyuansword.pid

logicserver()
{
cd $dir/logicserver/
   ./startXys.sh $1;
}

usercenter()
{
cd $dir/usercenter/
  ./startUserCenter.sh $1;
}

configserver()
{
cd $dir/configserver/
   ./startConfigServer.sh $1 ;
}



case $1 in
'start')
cd $dir/configserver/
   ./startConfigServer.sh $1 ;


cd $dir/usercenter/
  ./startUserCenter.sh $1;
  
cd $dir/guildserver/
  ./startGuildServer.sh $1;
    

cd $dir/logicserver/
   ./startXys.sh $1;


	;;
'stop')
cd $dir/logicserver/
   ./startXys.sh $1;
   
cd $dir/guildserver/
  ./startGuildServer.sh $1;

cd $dir/usercenter/
  ./startUserCenter.sh $1;

cd $dir/configserver/
   ./startConfigServer.sh $1 ;
	
rm $PID
	;;
esac

exit 0 
