package cn.toj.ssmmrzelkdemo.dao;

import cn.toj.ssmmrzelkdemo.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {
}
