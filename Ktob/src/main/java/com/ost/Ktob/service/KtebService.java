package com.ost.Ktob.service;

import com.ost.Ktob.model.Kteb;

import java.util.List;

public interface KtebService {

    Kteb saveKteb(Kteb kteb);

    void deleteKteb(Long id);

    List<Kteb> findKtob();
}
