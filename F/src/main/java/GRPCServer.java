import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.Msg;

public class GRPCServer 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Server server=ServerBuilder.forPort(8080)
									.addService(new Msg())
									.build();
		server.start();
		System.out.println("Server started at :"+server.getPort());
		server.awaitTermination();
	}
}
