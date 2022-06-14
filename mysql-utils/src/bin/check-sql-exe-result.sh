#!/bin/bash
# -d database
# -h ip address
# -P port
# -p password
# -u login user

while getopts ":d:h:P:p:u" optname
do
    case "$optname" in
      "d")
        echo "get option -d,value is $OPTARG"
        ;;
      "h")
        echo "get option -h ,value is $OPTARG"
        ;;
      "P")
        echo "get option -P, 举例:./this.sh -d itamp -P 3306"
        ;;
      "p")
        echo "get option -P ,value is $OPTARG"
        ;;
      "u")
        echo "get option -u ,value is $OPTARG"
        ;;
      ":")
        echo "No argument value for option $OPTARG, "
        ;;
      "?")
        echo "举例:./this.sh -d itamp -P 3306"
        ;;
      *)
        echo "举例:./this.sh -d itamp -P 3306"
        ;;
    esac
    #echo "option index is $OPTIND"
done

func dbconn {

}