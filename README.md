



[Reference](http://www.masterspringboot.com/various/camel/using-camel-netty-components-to-manage-socket-routes)


Exception in thread "main" java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:79)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at java.net.Socket.connect(Socket.java:538)
	at java.net.Socket.<init>(Socket.java:434)
	at java.net.Socket.<init>(Socket.java:211)
	at com.javax4u.camel.client.JavaClient.main(JavaClient.java:11)
	
io.netty.handler.codec.TooLongFrameException: Adjusted frame length exceeds 1048576: 1214606448 - discarded
	at io.netty.handler.codec.LengthFieldBasedFrameDecoder.fail(LengthFieldBasedFrameDecoder.java:513) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.LengthFieldBasedFrameDecoder.failIfNecessary(LengthFieldBasedFrameDecoder.java:491) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.LengthFieldBasedFrameDecoder.exceededFrameLength(LengthFieldBasedFrameDecoder.java:378) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.LengthFieldBasedFrameDecoder.decode(LengthFieldBasedFrameDecoder.java:421) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.serialization.ObjectDecoder.decode(ObjectDecoder.java:69) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at org.apache.camel.component.netty.codec.ObjectDecoder.decode(ObjectDecoder.java:35) ~[camel-netty-3.0.0.jar:3.0.0]
	at io.netty.handler.codec.LengthFieldBasedFrameDecoder.decode(LengthFieldBasedFrameDecoder.java:334) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:503) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:442) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:281) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:374) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:360) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:352) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1422) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:374) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:360) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:931) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:163) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:700) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:635) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:552) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:514) ~[netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.util.concurrent.SingleThreadEventExecutor$6.run(SingleThreadEventExecutor.java:1050) [netty-all-4.1.43.Final.jar:4.1.43.Final]
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) [netty-all-4.1.43.Final.jar:4.1.43.Final]
	at java.lang.Thread.run(Thread.java:748) [?:1.8.0_201]
	
[d #5 - NettyEventExecutorGroup] DEBUG Exchange[ExchangePattern: InOnly, BodyType: io.netty.buffer.PooledUnsafeDirectByteBuf, Body: 

 *** Hello Camel *** 

]
[d #5 - NettyEventExecutorGroup] DefaultReactiveExecutor  DEBUG Queuing reactive work: Callback[org.apache.camel.processor.CamelInternalProcessor$$Lambda$500/529558815@56160615]
