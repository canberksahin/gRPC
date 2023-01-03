package user;

import com.sm704.gRPC.User.APIResponse;
import com.sm704.gRPC.User.Empty;
import com.sm704.gRPC.User.LoginRequest;
import com.sm704.gRPC.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase{

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		
		System.out.println("Inside login");
		
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if(username.equals(password)) {
			
			 // return success message
			
			response.setResponseCode(0).setResponsemessage("SUCCESS");
			
		}
		else {
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}
		
		
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		
	}

	
	 
}