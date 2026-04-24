package github.com.ifyosakwe.clippy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import github.com.ifyosakwe.clippy.entity.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    // the left join part is to fetch the createdBy user along
    // with the short URL to avoid lazy loading issues in the view
    @Query("SELECT s FROM ShortUrl s LEFT JOIN FETCH s.createdBy WHERE s.isPrivate = false ORDER BY s.createdAt DESC")
    List<ShortUrl> findPublicShortUrls();

    boolean existsByShortKey(String shortKey);

    Optional<ShortUrl> findByShortKey(String shortKey);

    @Query("select su from ShortUrl su left join fetch su.createdBy where su.isPrivate = false")
    Page<ShortUrl> findPublicShortUrls(Pageable pageable);

}
