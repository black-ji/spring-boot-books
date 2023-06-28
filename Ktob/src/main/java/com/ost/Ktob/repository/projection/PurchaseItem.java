package com.ost.Ktob.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem {

    String getKtebTitle();
    Double getKtebPrice();
    LocalDateTime getPurchaseDate();
}
