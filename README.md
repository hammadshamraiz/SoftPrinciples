# SoftPrinciples
# Library Management System

## 1. Without Polymorphism
- Uses `if-else` statements to manage user access.
- Hard to extend when adding new roles.
- Violates Open-Closed Principle.

## 2. With Polymorphism
- Uses **inheritance & method overriding**.
- New roles (e.g., `Guest`, `Admin`) can be added easily.
- **Follows Open-Closed Principle** (code is open for extension, closed for modification).

### **Conclusion**
Using polymorphism makes the **Library Management System** **scalable, clean, and maintainable**.
