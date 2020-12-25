package com.tobacco.servicies;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


public class CurrentUserDetails {

    public static HttpResponse<String> getUserSecurity() throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://shishaproject.eu.auth0.com/api/v2/users")
                .header("authorization", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InJnNFpqdFJFX19RR1YzLUJ6dkdFaCJ9.eyJpc3MiOiJodHRwczovL3NoaXNoYXByb2plY3QuZXUuYXV0aDAuY29tLyIsInN1YiI6Imdvb2dsZS1vYXV0aDJ8MTA1NTExNDg2OTcxNzQyMjMxNzQ4IiwiYXVkIjpbInNoaXNoYXByb2plY3RfYmFja2VuZCIsImh0dHBzOi8vc2hpc2hhcHJvamVjdC5ldS5hdXRoMC5jb20vdXNlcmluZm8iXSwiaWF0IjoxNjA4Mzk4MzQ4LCJleHAiOjE2MDg0ODQ3NDgsImF6cCI6ImltMmZtaTY4cGFJRENXQkUwMzU5SThrU3Mzd2pJYW12Iiwic2NvcGUiOiJvcGVuaWQgcHJvZmlsZSBlbWFpbCIsInBlcm1pc3Npb25zIjpbXX0.SDdZuYM0YKhGYU_SPCzkCvaU2thvjxCGYOA7A6qMc-1Nceg3V8GWtLnWFvKOTnc_IZJ_NZuTU0Cxs6Gz4rsIZVwuMtEEJ689-8Euy_lX1azIqPfGj_gf0CDrv4EP6LlZt9rIRVDfUqgjvA7Nnr1rPz7z7RBr8F1Qb2bmPTk26yKidqSfXqrAF1YwXDZdw9TP_5StKeOIFD4gXEYNRVe_sKPw-U1Hg1P0slTxRzGTpAQKw5I6fsS1ZtQSikuFjq38fh9kEMHgKmDRatmqBG7b0RPRHdo7gRsCKNHEr-vE2AP_3ZRhjcV4x0gdK9TllYihXOdVFFVMZXDmdZj-RIEF0Q")
                .asString();

        return  response;
    }

    private static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
