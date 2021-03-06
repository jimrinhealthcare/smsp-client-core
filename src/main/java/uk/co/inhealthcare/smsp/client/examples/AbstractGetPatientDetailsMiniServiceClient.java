package uk.co.inhealthcare.smsp.client.examples;

import uk.co.inhealthcare.smsp.client.itk.ITKGateway;
import uk.co.inhealthcare.smsp.client.services.RequestContext;
import uk.co.inhealthcare.smsp.client.services.pds.GetPatientDetailsResponse;

public abstract class AbstractGetPatientDetailsMiniServiceClient extends AbstractMiniServiceClient {

	public AbstractGetPatientDetailsMiniServiceClient(ITKGateway itkGateway, RequestContext context) {
		super(itkGateway, context);
	}

	protected void handleResponse(GetPatientDetailsResponse response) {
	
		System.out.println("");
		System.out.println("Get Patient Details By NHS Number");
		System.out.println("");
		System.out.println("Response getMessageId: " + response.getMessageId());
		System.out.println("Response getCode: " + response.getCode().getCode());
		System.out.println("Response getCodeDescription: " + response.getCode().getDescription());
		System.out.println("Response getPatientDetails: " + response.getPatientDetails());
	}

}