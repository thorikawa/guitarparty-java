package com.polysfactory.lib.guitarparty;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

public class GuitarpartyClient {

    private static final String URI = "http://api.guitarparty.com";

    private static final String GUITARPARTY_API_KEY = "Guitarparty-Api-Key";

    public GuitarpartyService getService(final String apiKey) {
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(URI)
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade facade) {
                        facade.addHeader(GUITARPARTY_API_KEY, apiKey);
                    }
                }).build();
        GuitarpartyService service = restAdapter.create(GuitarpartyService.class);
        return service;
    }

}
