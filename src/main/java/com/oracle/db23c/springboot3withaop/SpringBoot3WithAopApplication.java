package com.oracle.db23c.springboot3withaop;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

import java.util.ServiceLoader;

@SpringBootApplication
@ImportRuntimeHints(SpringBoot3WithAopApplication.AspectRuntimeHints.class)
public class SpringBoot3WithAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3WithAopApplication.class, args);
    }

    static class AspectRuntimeHints implements RuntimeHintsRegistrar{
        @Override
        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
            hints.reflection().registerType(org.hibernate.search.mapper.orm.logging.impl.Log_$logger.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.mapper.pojo.logging.impl.Log_$logger.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.engine.logging.impl.Log_$logger.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.util.common.logging.impl.Log_$logger.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.mapper.orm.reporting.impl.HibernateOrmEventContextMessages_$bundle.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.mapper.pojo.reporting.impl.PojoConstructorProjectionDefinitionMessages_$bundle.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.engine.reporting.impl.EngineEventContextMessages_$bundle.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.util.common.reporting.impl.CommonEventContextMessages_$bundle.class, MemberCategory.values());
            hints.reflection().registerType(ServiceLoader.class, MemberCategory.values());
            hints.reflection().registerType(ServiceLoader.Provider.class, MemberCategory.values());

            hints.reflection().registerType(org.hibernate.search.backend.lucene.reporting.impl.LuceneSearchHints_$bundle.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.engine.backend.reporting.spi.BackendMappingHints_$bundle.class, MemberCategory.values());
            hints.reflection().registerType(org.hibernate.search.engine.backend.reporting.spi.BackendSearchHints_$bundle.class, MemberCategory.values());

        }
    }
}
