package com.tejeet.tataclicq_clone.ApiClients;

import com.tejeet.tataclicq_clone.DataNModels.CallResponseDTO;
import com.tejeet.tataclicq_clone.DataNModels.LoginResponseDTO;
import com.tejeet.tataclicq_clone.DataNModels.ResponseDTO;
import com.tejeet.tataclicq_clone.DataNModels.SignupResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiClient {

    @GET("api.php")
    Call<ResponseDTO> getProductsByCategory(@Query("category") String productCategory);

    @GET("api.php")
    Call<LoginResponseDTO> getUserDetails(@Query("email") String email, @Query("pass") String pass);

    @GET("api.php")
    Call<SignupResponseDTO> addNewUser(@Query("username") String name,
                                       @Query("emailid") String email,
                                       @Query("mobile") String mobile);

    @GET("api.php")
    Call<CallResponseDTO> sendConfirmCall(@Query("orderName") String orderName, @Query("amount") String amount, @Query("mobile") String mobile);


}
