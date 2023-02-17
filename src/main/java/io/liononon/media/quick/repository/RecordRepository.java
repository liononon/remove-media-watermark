package io.liononon.media.quick.repository;

import io.liononon.media.quick.pojo.domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/1/3 21:44
 * @description：
 */
@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {
    Record findByWechatUserId(String userId);
}
