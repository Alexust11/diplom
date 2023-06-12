package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Comment;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    Collection<Comment> getByAdsId(int adsId);

    void deleteByAdsIdAndId(Integer adsId, Integer commentId);

    Optional<Comment> getByAdsIdAndId(Integer adsId, Integer commentId);
}
