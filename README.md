<div align="center">
  <a href="https://cloud-station.io">
    <img src="https://server.cloud-station.io/cloudstation/cs_icon.png" alt="CloudStation Logo" width="50">
  </a>
  <h3 align="center">Java Example for CloudStation</h3>
  <p align="center">
    Deploy your Java application seamlessly with CloudStation.
    <br />
    <a href="https://cloud-station.io">Visit CloudStation</a> ·
    <a href="https://documentation.cloud-station.io/s/ce6e8846-8aec-4337-a850-5188b6dc6d6e">Documentation</a> ·
    <a href="https://blog.cloud-station.io">Blog</a>
  </p>
</div>

## Overview

This is a simple Spring Boot application that provides a RESTful API for managing a collection of books.


## Features

- RESTful API for CRUD operations on books
- In-memory storage for simplicity
- Docker support for easy deployment

## Getting Started

Follow these steps to get your Spring Boot API running on CloudStation.
### Prerequisites

Ensure you have a CloudStation account. If you don't have one yet, sign up [here](https://www.cloud-station.io/signup).


### Step-by-Step Deployment (For Customization)

If you want to customize the application before deployment, follow these steps:

1. **Fork the Repository:**
   Click the Fork button at the top-right of this repository to create your own copy.

2. **Deploy the Application:**
   - Navigate to the CloudStation [Dashboard](https://www.cloud-station.io/dashboard/project).
   - Create a new project.
   - Click on `Add New` and select **GitHub**.
   - In the repositories list, select the repository you just forked.
   - Click **Deploy**.

3. **Access Your Application**

Once deployed, your application will be accessible at https://java-example.cloud-station.app.
## Running Locally

1. Clone the repository
2. Navigate to the project directory
3. Build the project:
   ```
   mvn clean package
   ```
4. Run the application:
   ```
   java -jar target/java-example-1.0-SNAPSHOT.jar
   ```

The application will start on `http://localhost:8080`.   

## API Endpoints

- GET `/api/books`: Retrieve all books
- GET `/api/books/{id}`: Retrieve a specific book
- POST `/api/books`: Create a new book
- PUT `/api/books/{id}`: Update an existing book
- DELETE `/api/books/{id}`: Delete a book


### Customization

Feel free to modify the code to add more features or change the existing functionality. After making changes, commit and push to your forked repository, and CloudStation will automatically redeploy the updated application.

### Contributing

We welcome contributions to enhance this example application. Feel free to fork the repository, create a feature branch, and submit a pull request.

### Support

For support, visit our [Help Center](https://documentation.cloud-station.io/s/ce6e8846-8aec-4337-a850-5188b6dc6d6e) or reach out via [Slack](https://join.slack.com/t/cloudstationio/shared_invite/zt-20kougo40-Kd1196QzZ7bwUA0oPfZORA).

## Connect with Us

<p align="center">
  <a href="https://www.cloud-station.io/">Website</a> · 
  <a href="https://twitter.com/CloudStation_io">Twitter</a> · 
  <a href="https://join.slack.com/t/cloudstationio/shared_invite/zt-20kougo40-Kd1196QzZ7bwUA0oPfZORA">Slack</a>
</p>
