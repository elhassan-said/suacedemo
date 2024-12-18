# Automation Testing for SauceDemo

This repository contains a comprehensive automation testing framework for the [SauceDemo](https://www.saucedemo.com) e-commerce website. It uses Selenium WebDriver for browser automation, TestNG for test execution, and Maven for dependency management. The framework is designed to ensure the scalability, readability, and maintainability of test scripts.

---

## Table of Contents

1. [Overview](#overview)
2. [Technologies Used](#technologies-used)
3. [Features](#features)
4. [Getting Started](#getting-started)
5. [Test Scenarios Covered](#test-scenarios-covered)
6. [Reporting](#reporting)

---

## Overview

The goal of this script is to automate the end-to-end testing of the SauceDemo website, which is a sample online shopping application. The framework tests various functionalities, such as user login, product search, cart management, and order processing, across multiple browsers and environments.

---

## Technologies Used

- **Programming Language**: Java
- **Test Framework**: TestNG
- **Build Tool**: Maven
- **Browser Automation Tool**: Selenium WebDriver
- **Reporting**: Extent Reports
- **Version Control**: Git

---

## Features

- Modular and reusable test scripts following the **Page Object Model (POM)**.
- Cross-browser testing with Chrome, Firefox, and Edge.
- Configuration-driven framework with support for multiple environments (QA, Staging, Production).
- Parallel execution of test cases using TestNG XML configuration.
- Comprehensive reporting using Extent Reports.

---

## Getting Started

### Prerequisites

Ensure the following software is installed on your system:

1. **Java Development Kit (JDK)** - Version 17 or higher.
2. **Maven** - For dependency management and build execution.
3. **IDE** - IntelliJ IDEA, Eclipse, or your preferred Java IDE.

---

## Test Scenarios Covered

The following test scenarios are automated:

### Login Functionality:
- Valid user login.
- Invalid login (wrong username/password).

### Product Search and Filter:
- Viewing products by category.
- Applying sorting filters (Price, Name, etc.).

### Cart and Checkout:
- Adding and removing products to/from the cart.
- Verifying the cart summary.
- Completing an order.

---

## Reporting

After execution, the test results are generated in the `test-output/` directory. Reports include:

- **HTML Report**: Navigate to `test-output/ExtentReports/` to view detailed test results.
