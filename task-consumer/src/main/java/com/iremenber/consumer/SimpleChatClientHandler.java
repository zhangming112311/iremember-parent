package com.iremenber.consumer;


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SimpleChatClientHandler extends  SimpleChannelInboundHandler<String> {
    protected void channelRead0(ChannelHandlerContext ctx, String s){
        System.out.println(s);
    }

	@Override
	protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
		// TODO Auto-generated method stub
		
	}
}