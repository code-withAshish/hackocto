# Certificate Issuance & Verification Backend

## Overview
This is the backend for the **Certificate Issuance & Verification System**, built using **Spring Boot**. It interacts with a **private Ethereum-based blockchain (Hyperledger Besu with IBFT 2.0)** for secure and tamper-proof certificate issuance. The backend exposes **REST APIs** to issue and verify certificates by interacting with a deployed smart contract.

## Project Structure
```
backend/
│── src/main/java/com/example/
│   ├── controller/      # REST controllers for API endpoints
│   ├── model/           # JPA entities (database models if needed)
│   ├── dto/             # Data Transfer Objects (DTOs)
│   ├── repository/      # Repositories for database interaction (if applicable)
│   ├── security/        # Security configurations (e.g., authentication, authorization)
│   ├── service/         # Business logic and blockchain interaction
│   ├── utils/           # Utility classes
│   ├── web3j.models/    # Auto-generated smart contract wrapper (from Web3j)
│── pom.xml              # Maven dependencies
│── README.md            # Project documentation
```

## Blockchain Integration
### **Smart Contract**
The backend interacts with a deployed **Solidity smart contract** on the private Hyperledger Besu network. The smart contract handles:
- **Issuing certificates** (stored on-chain)
- **Verifying certificates** (retrieved on-chain)

### **Web3j Integration**
We use **Web3j** to interact with the blockchain. The **web3j.models** package contains the auto-generated Java wrapper for the smart contract, simplifying contract calls.

## Getting Started
### **1️⃣ Prerequisites**
- Java 17+
- Maven
- A running **Hyperledger Besu private network** (Team leader will provide)
- A deployed **CertificateRegistry smart contract** (Team leader will provide)

### **2️⃣ Setup Instructions**
#### **Clone the Repository**
```bash
git clone <repository-url>
cd backend
```

#### **Configure Environment Variables**
Create an `.env` file or modify `application.properties` with:
```properties
BLOCKCHAIN_RPC_URL=http://localhost:8545  # Replace with Besu RPC URL
BLOCKCHAIN_PRIVATE_KEY=<your-private-key>  # Private key for signing transactions
SMART_CONTRACT_ADDRESS=<deployed-contract-address>
```

#### **Build & Run the Application**
```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints
### **1️⃣ Issue Certificate**
**Endpoint:** `POST /certificates/issue`
```json
{
  "studentId": "12345",
  "studentName": "John Doe",
  "course": "Blockchain Fundamentals"
}
```
📌 **Stores the certificate on-chain and returns transaction hash.**

### **2️⃣ Verify Certificate**
**Endpoint:** `GET /certificates/verify?studentId=12345`
📌 **Retrieves certificate details from the blockchain.**
```json
{
  "studentName": "John Doe",
  "course": "Blockchain Fundamentals",
  "dateIssued": 1710000000
}
```

## Code Guidelines
To maintain consistency and readability, follow these coding standards:

### **1️⃣ Package & Class Naming**
- Package names should be in **lowercase** (e.g., `com.example.service`).
- Class names should follow **PascalCase** (e.g., `CertificateService`).

### **2️⃣ REST Controller Best Practices**
- Use meaningful endpoint names (`/certificates/issue` instead of `/issueCert`).
- Annotate controllers properly:
  ```java
  @RestController
  @RequestMapping("/certificates")
  public class CertificateController {
      // rest of the code
  }
  ```

### **3️⃣ DTO Usage**
- Always use **DTOs** for API responses instead of exposing entities.
- Example:
  ```java
  public class CertificateDTO {
      private String studentName;
      private String course;
      private long dateIssued;
  }
  ```

### **4️⃣ Logging**
- Use **SLF4J Logger** for logging:
  ```java
  private static final Logger logger = LoggerFactory.getLogger(CertificateService.class);
  ```
- Log important transactions but avoid logging sensitive information.

### **5️⃣ Exception Handling**
- Use a **global exception handler** instead of try-catch everywhere:
  ```java
  @ControllerAdvice
  public class GlobalExceptionHandler {
      @ExceptionHandler(Exception.class)
      public ResponseEntity<String> handleException(Exception ex) {
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
      }
  }
  ```

---

## Future Improvements
- Implement role-based access control (RBAC) for enhanced security.
- Optimize smart contract interactions to reduce gas costs.
- Add caching mechanisms to improve performance when querying certificates.
- Introduce unit and integration testing for API endpoints.

## Support & Contributions
For any issues or feature requests, feel free to raise a ticket in the repository.
Contributions are welcome! Please follow the coding guidelines before submitting a PR.

🚀 **Happy Coding & Building!** 🎯

