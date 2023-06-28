package com.ost.Ktob.repository;

import com.ost.Ktob.model.Purchase;
import com.ost.Ktob.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {

    @Query("select "+
    "k.title as title , pc.price as price , pc.purchase_date as purchase_date " +
    "from Purchase pc left join Kteb k on k.id = pc.bookId " +
    "where pc.userId = :userId")
    List<PurchaseItem> findAllUserPurchases(@Param("userId") Long userId);
}
