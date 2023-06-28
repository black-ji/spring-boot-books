package com.ost.Ktob.service;

import com.ost.Ktob.model.Purchase;
import com.ost.Ktob.repository.PurchaseRepository;
import com.ost.Ktob.repository.projection.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImp implements PurchaseService{

    public final PurchaseRepository purchaseRepository;

    public PurchaseServiceImp(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase)
    {
        purchase.setPurchase_date(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findUserPurchaseItems(Long userId){
        return purchaseRepository.findAllUserPurchases(userId);
    }
}
