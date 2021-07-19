package user;

import grpc.clientserver1.Helloworld.req;
import grpc.clientserver1.Helloworld.response;
import grpc.clientserver1.helloworldGrpc.helloworldImplBase;
import io.grpc.stub.StreamObserver;

public class Msg extends helloworldImplBase
{

	@Override
	public void hello(req request, StreamObserver<response> responseObserver) 
	{
		String	name="Hello "+request.getFirst()+" "+request.getSecond();
		//System.out.println(name);
		response.Builder ret=response.newBuilder();
		ret.setRet(name);
		responseObserver.onNext(ret.build());
		responseObserver.onCompleted();
	}
	
}
