package clnt;

import grpc.clientserver1.Helloworld.req;
import grpc.clientserver1.Helloworld.response;
import grpc.clientserver1.Helloworld.req.Builder;
import grpc.clientserver1.helloworldGrpc;
import grpc.clientserver1.helloworldGrpc.helloworldBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient 
{
	public static void main(String[] args)
	{
		ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
		helloworldBlockingStub userStub=helloworldGrpc.newBlockingStub(channel);
		String firstName="Varkeychan";
		String lastName="Jacob";
		
		req.Builder input=req.newBuilder().setFirst(firstName).setSecond(lastName);
		req temp=input.build();
		response output=userStub.hello(temp);
		System.out.println(output.getRet()+" from Client Code!");
	}

}
