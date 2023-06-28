package com.ost.Ktob.controller;

import com.ost.Ktob.model.Purchase;
import com.ost.Ktob.security.UserPrincipal;
import com.ost.Ktob.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping //api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping //api/purchase
    public ResponseEntity<?> getAllUsersPurchases(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return  ResponseEntity.ok(purchaseService.findUserPurchaseItems(userPrincipal.getId()));
    }
}
