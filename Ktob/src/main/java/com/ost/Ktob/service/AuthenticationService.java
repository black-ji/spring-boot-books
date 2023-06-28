package com.ost.Ktob.service;

import com.ost.Ktob.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
