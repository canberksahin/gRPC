package com.sm704.gRPC.server;

import java.io.IOException;

import countryService.CountryService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

	 public static void main(String args[]) throws IOException, InterruptedException {
		 
		 System.out.println("starting GRPC Server");
		 Server server = ServerBuilder.forPort(9090).addService(

				 new CountryService()).build();
		 
		 server.start();
		 System.out.println("server started at "+ server.getPort());
	        server.awaitTermination();
	 }
}