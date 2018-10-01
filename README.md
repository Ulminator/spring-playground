#Spring Fundamentals

### Overview
- Enabled Enterprise development without using an application server.
	- Tomcat is just a web server.
- Completely POJO based.
- Unobtrusive. Built due to frustrations of J2EE.
- AOP/Proxies which makes your code smaller.
- Best Practices.
	- Singleton, Factories, Abstract Factories built into code.

When a bean is registered, they are singleton by default and will only methods in the AppConfig once and then return a cached instance later.

## Bean Scopes

5 Scopes (@Scope Annotation)

- Can use ConfigurableBeanFactory.SCOPE_${TYPE} as argument.
- Valid in any configuration
    - Singleton
        - Default Spring Scope
        - One instance per Spring container
            - Could have more than one per JVM
    - Prototype
        - Guarantees a new instance per request 
- Valid only in web-aware Spring projects
    - Request
        - Returns a bean per HTTP request
    - Session
        - Returns a single bean per HTTP session
        - Lives as long as a user session is alive
    - Global
        - Returns a single bean per application
        - Shared across all users