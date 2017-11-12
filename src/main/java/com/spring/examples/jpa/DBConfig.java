package com.spring.examples.jpa;

//@EnableJpaRepositories(basePackages = "com.spring.examples.jpa.entities")
//@PropertySource("classpath:application.properties")
//@EnableTransactionManagement
//@Configuration
public class DBConfig {
	//
	// @Autowired
	// private Environment env;
	//
	// Properties additionalProperties() {
	// Properties properties = new Properties();
	// properties.setProperty("hibernate.hbm2ddl.auto",
	// env.getProperty("hibernate.hbm2ddl.auto"));
	// properties.setProperty("hibernate.dialect",
	// env.getProperty("hibernate.dialect"));
	// properties.setProperty("hibernate.current_session_context_class",
	// env.getProperty("hibernate.current_session_context_class"));
	// properties.setProperty("hibernate.globally_quoted_identifiers", "true");
	// properties.setProperty("hibernate.show_sql",
	// env.getProperty("hibernate.show_sql"));
	// return properties;
	// }
	//
	// @Bean
	// //@ConfigurationProperties(prefix = "hibernate.connection")
	// public DataSource dataSource() {
	// DriverManagerDataSource dataSource = new DriverManagerDataSource();
	// dataSource.setDriverClassName(env.getProperty("hibernate.connection.driver_class"));
	// dataSource.setUrl(env.getProperty("hibernate.connection.url"));
	// dataSource.setUsername(env.getProperty("hibernate.connection.username"));
	// dataSource.setPassword(env.getProperty("hibernate.connection.password"));
	// //return DataSourceBuilder.create().build();
	// return dataSource;
	// }
	//
	//// @Bean
	//// public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
	//// LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	//// sessionFactory.setDataSource(dataSource);
	//// sessionFactory.setPackagesToScan(new String[] {
	// "com.spring.examples.jpa.entities" });
	//// sessionFactory.setHibernateProperties(additionalProperties());
	////
	//// return sessionFactory;
	//// }
	//
	// @Bean
	// @Autowired
	// public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
	// HibernateJpaVendorAdapter vendorAdapter = new
	// HibernateJpaVendorAdapter();
	// vendorAdapter.setGenerateDdl(true);
	// vendorAdapter.setShowSql(true);
	// vendorAdapter.setDatabasePlatform(env.getProperty("hibernate.dialect"));
	//
	//// Properties jpaProperties = new Properties();
	//// jpaProperties.setProperty("hibernate.show_sql", showsql);
	//// jpaProperties.setProperty("hibernate.dialect", dialect);
	//
	// LocalContainerEntityManagerFactoryBean
	// localContainerEntityManagerFactoryBean = new
	// LocalContainerEntityManagerFactoryBean();
	// localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
	// localContainerEntityManagerFactoryBean.setPackagesToScan("com.spring.examples.jpa.entities");
	// localContainerEntityManagerFactoryBean.setDataSource(dataSource);
	// localContainerEntityManagerFactoryBean.setJpaProperties(additionalProperties());
	// localContainerEntityManagerFactoryBean.afterPropertiesSet();
	//
	// return localContainerEntityManagerFactoryBean.getObject();
	// }
	//
	// @Bean
	// @Autowired
	// public PlatformTransactionManager transactionManager(EntityManagerFactory
	// entityManagerFactory) {
	// JpaTransactionManager jpaTransactionManager = new
	// JpaTransactionManager();
	// jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
	// return jpaTransactionManager;
	// }
	//
	//// @Bean
	//// @Autowired
	//// public HibernateTransactionManager transactionManager(SessionFactory
	// sessionFactory) {
	////
	//// HibernateTransactionManager txManager = new
	// HibernateTransactionManager();
	//// txManager.setSessionFactory(sessionFactory);
	////
	//// return txManager;
	//// }
	//
	// // @Bean
	// // public PersistenceExceptionTranslationPostProcessor
	// // exceptionTranslation() {
	// // return new PersistenceExceptionTranslationPostProcessor();
	// // }
}