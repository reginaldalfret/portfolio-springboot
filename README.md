# Reginald Alfret V — Resume Portfolio (Spring Boot 3 & Java 21)

Modern obsidian liquid-glass resume portfolio engineered with **Spring Boot 3.4**, **Java 21 LTS**, **Thymeleaf SSR**, and **Tailwind CSS**.

Parallel implementation of the production portfolio at [**reginaldalfret.tech**](https://reginaldalfret.tech).

---

## ⚡ Tech Stack

- **Framework**: Spring Boot 3.4.3
- **Language / Runtime**: Java 21 (OpenJDK 21.0.12 LTS)
- **Templating**: Thymeleaf Server-Side Rendering
- **Server**: Embedded Apache Tomcat 10.1
- **Styling**: Tailwind CSS (Liquid-Glass Obsidian Design System)
- **Build Tool**: Apache Maven (via `./mvnw`)

---

## 🚀 Getting Started

### Prerequisites

- Java 21+ (`java -version` returns JDK 21)

### Run with Maven Wrapper

```bash
# Clone the repository
git clone https://github.com/reginaldalfret/portfolio-springboot.git
cd portfolio-springboot

# Run the Spring Boot application (default port 8082)
./mvnw spring-boot:run
```

Open [http://localhost:8082](http://localhost:8082) in your browser.

### Package Executable JAR

```bash
./mvnw clean package -DskipTests
java -jar target/portfolio-0.0.1-SNAPSHOT.jar --server.port=8082
```

---

## 🌐 Multi-Stack Ecosystem

This portfolio is natively built across four frameworks:
1. **Next.js 14** (Production Core): [https://reginaldalfret.tech](https://reginaldalfret.tech)
2. **Nuxt 3 / Vue 3**: [https://reginaldalfret.tech/stacks/nuxt](https://reginaldalfret.tech/stacks/nuxt)
3. **Django 6 / Python 3.13**: [https://reginaldalfret.tech/stacks/django](https://reginaldalfret.tech/stacks/django)
4. **Spring Boot 3 / Java 21**: [https://reginaldalfret.tech/stacks/springboot](https://reginaldalfret.tech/stacks/springboot)

---

## 👤 Author

**Reginald Alfret V**
- Email: [reginaldalfret@gmail.com](mailto:reginaldalfret@gmail.com)
- GitHub: [@reginaldalfret](https://github.com/reginaldalfret)
- LinkedIn: [in/reginaldalfret](https://linkedin.com/in/reginaldalfret)
