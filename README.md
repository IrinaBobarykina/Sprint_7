<h3 align="center">YANDEX PRACTICUM.SPRINT 7</h3>

<!-- ABOUT THE PROJECT -->
## About The Project

The project contains API auto tests for the service [Яндекс.Самокат](https://qa-scooter.praktikum-services.ru/)
### Built With

* Java 11
* Maven 3.8.1
* JUnit 4.13.2
* Allure 2.21.0
* Aspectj 1.9.7
* Gson 2.10.1<
* Rest Assured 5.3.0


<!-- GETTING STARTED -->
## Getting Started

1. Clone the repo
   ```sh
   git clone https://github.com/IrinaBobarykina/Sprint_7.git
   ```
2. To run autotests use
   ```sh
   mvn clean test
   ```
3. To get allure report use 
   ```js
   mvn allure:serve
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- APIs -->
## Tested APIs
### [API doc](https://qa-scooter.praktikum-services.ru/docs/#api-Courier-Login)

1. Courier registration 
```sh
POST /api/v1/courier
```
2. Courier login 
```sh
POST /api/v1/courier/login
```
3. Order creating 
```sh
POST /api/v1/orders
```
4. Getting list of orders 
```sh
GET /api/v1/orders
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Your Name -  ira.bobarykina5@gmail.com

Project Link: [https://github.com/IrinaBobarykina/Sprint_7](https://github.com/IrinaBobarykina/Sprint_7)

<p align="right">(<a href="#readme-top">back to top</a>)</p>