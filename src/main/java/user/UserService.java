package user;

import com.sm704.gRPC.CountryOuterClass.Country;
import com.sm704.gRPC.CountryOuterClass.Currency;
import com.sm704.gRPC.CountryOuterClass.GetCountryRequest;
import com.sm704.gRPC.CountryOuterClass.getCountryResponse;
import com.sm704.gRPC.countryGrpc.countryImplBase;
import com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest;
import com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse;

import io.grpc.stub.StreamObserver;

public class UserService extends countryImplBase {

	@Override
	public void getCountry(GetCountryRequest request, StreamObserver<getCountryResponse> responseObserver) {
		
		System.out.println("Inside GetCountry Method");
		String countryName = request.getName();
		
		getCountryResponse.Builder response = getCountryResponse.newBuilder();
		Country country = new Country();
		switch(countryName) {
		
		  case "Spain":
			  
			  response.setCountry(Country.newBuilder().setCapital("Madrid").setCurrency(Currency.EUR).setPopulation(46704314).setName("Spain"));
		    break;
		  case "Poland":
			  response.setCountry(Country.newBuilder().setCapital("Warsaw").setCurrency(Currency.PLN).setPopulation(46704314).setName("38186860"));
		    break;
		  case "United Kingdom":
			  response.setCountry(Country.newBuilder().setCapital("London").setCurrency(Currency.GBP).setPopulation(46704314).setName("United Kingdom"));
			    break;
		  default:
		    // code block
		}
		
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getCountryPopulation(GetCountryPopulationRequest request,
			StreamObserver<getCountryPopulationResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.getCountryPopulation(request, responseObserver);
	}

	
}