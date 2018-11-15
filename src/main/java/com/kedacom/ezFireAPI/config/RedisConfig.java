package com.kedacom.ezFireAPI.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by fudapeng on 2018/5/22.
 */
@Configuration
public class RedisConfig {
    private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${spring.redis.host}")
    private String redisIp;
    @Value("${spring.redis.port}")
    private int reidsPort;

    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    public JedisPoolConfig getRedisConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }

    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    public JedisConnectionFactory getConnectionFactory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        JedisPoolConfig config = getRedisConfig();
        factory.setPoolConfig(config);
        logger.info("JedisConnectionFactory bean init success.");
        return factory;
    }

    @Bean
    public RedisTemplate<?, ?> getRedisTemplate(){
        RedisTemplate<?,?> template = new StringRedisTemplate(getConnectionFactory());
        return template;
    }

    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    public JedisPool getJedisPool() {
        JedisPool jedisPool= new JedisPool(getRedisConfig(), redisIp, reidsPort);
        return jedisPool;
    }

    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    public Jedis getJedis() {
        return getJedisPool().getResource();
    }
}
