# gend java support

这里简单对gend 动态库进行封装

包含两个项目，

一个是合并版本，合并版首先请求grpc，如果grpc失败，则会请求嵌入式版，最后尝试请求mybatis plus idWorker生成id

一个是对spring boot的封装（spring aop），只要注入IdFacadeFactoryBean就可以得到一个IdFacade 的Bean，调用即可

