### Repo for playing with kafka:

#### Installation:
brew install kafka (it will install zookeeper as well)

#### Starting up:

1. start zookeeper <br/>
`bin/zookeeper-server-start.sh /usr/local/etc/kafka/zookeeper.properties`

2. start kafka <br/>
`bin/kafka-server-start.sh /usr/local/etc/kafka/server.properties` 

3. create topic <br/>
`kafka-topics --create --topic testTopic -zookeeper localhost:2181 --reeplication-factor 1 --partitions 1`