package com.ost.Ktob.service;

import com.ost.Ktob.model.Purchase;
import com.ost.Ktob.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findUserPurchaseItems(Long userId);
}
