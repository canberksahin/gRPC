package countryService;

import com.sm704.gRPC.CountryOuterClass.Country;
import com.sm704.gRPC.CountryOuterClass.Currency;
import com.sm704.gRPC.CountryOuterClass.GetCountryRequest;
import com.sm704.gRPC.CountryOuterClass.getCountryResponse;
import com.sm704.gRPC.countryGrpc.countryImplBase;
import com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest;
import com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse;

import io.grpc.stub.StreamObserver;

public class CountryService extends countryImplBase {

	@Override
	public void getCountry(GetCountryRequest request, StreamObserver<getCountryResponse> responseObserver) {
		
		System.out.println("Inside GetCountry Method");
		String countryName = request.getName();
		
		getCountryResponse.Builder response = getCountryResponse.newBuilder();
		Country country = new Country();
		switch(countryName) {
		
		  case "Spain":
			  
			  response.setCountry(Country.newBuilder().setCapital("Madrid").setCurrency(Currency.EUR).setPopulation(678578532).setName("Spain"));
		    break;
		  case "Poland":
			  response.setCountry(Country.newBuilder().setCapital("Warsaw").setCurrency(Currency.PLN).setPopulation(243524352).setName("38186860"));
		    break;
		  case "United Kingdom":
			  response.setCountry(Country.newBuilder().setCapital("London").setCurrency(Currency.GBP).setPopulation(57597859).setName("United Kingdom"));
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
		
		System.out.println("Inside getCountryPopulation Method");
		String countryName = request.getName();
		
		getCountryPopulationResponse.Builder response = getCountryPopulationResponse.newBuilder();
		switch(countryName) {
		
		  case "Spain":
			  response.setPopulation(678578532);
		    break;
		  case "Poland":
			  response.setPopulation(243524352);
		    break;
		  case "United Kingdom":
			  response.setPopulation(57597859);
			    break;
		  default:
		    // code block
		}
		
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	
}