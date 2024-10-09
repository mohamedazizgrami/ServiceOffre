# Spring Boot Application Deployment on Azure

This repository contains a Spring Boot application that is deployed on Azure App Service using GitHub Actions for continuous integration and deployment.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Step 1: Prepare Your Spring Boot Application](#step-1-prepare-your-spring-boot-application)
- [Step 2: Push Your Code to GitHub](#step-2-push-your-code-to-github)
- [Step 3: Create an Azure App Service](#step-3-create-an-azure-app-service)
- [Step 4: Configure Deployment from GitHub](#step-4-configure-deployment-from-github)
- [Step 5: Configure Application Settings](#step-5-configure-application-settings)
- [Step 6: Test Your Deployment](#step-6-test-your-deployment)
- [Additional Resources](#additional-resources)

## Prerequisites
- An Azure account
- Git and GitHub account
- Java Development Kit (JDK) installed
- Maven or Gradle (depending on your project setup)

## Step 1: Prepare Your Spring Boot Application

1. **Ensure Your Application is Ready**: Make sure your Spring Boot application is correctly configured and working locally. Test it to ensure all features function as expected.

2. **Create a `pom.xml` or `build.gradle`**: Ensure your project has a `pom.xml` (for Maven) or `build.gradle` (for Gradle) file configured with the necessary dependencies for Spring Boot.

## Step 2: Push Your Code to GitHub

1. **Create a GitHub Repository**: If you haven’t done this yet, create a new repository on GitHub.

2. **Push Your Code**:
   - If your local project is not yet a Git repository, run the following commands in your project directory:
     ```bash
     git init
     git add .
     git commit -m "Initial commit"
     ```
   - Add the remote GitHub repository:
     ```bash
     git remote add origin <YOUR_GITHUB_REPO_URL>
     ```
   - Push your code:
     ```bash
     git push -u origin main
     ```

## Step 3: Create an Azure App Service

1. **Log in to Azure Portal**: Go to [Azure Portal](https://portal.azure.com/).

2. **Create a New App Service**:
   - Click on **Create a resource**.
   - Search for **App Service** and select it.
   - Click on **Create**.

3. **Configure Your App Service**:
   - **Basics**:
     - **Subscription**: Select your Azure subscription.
     - **Resource Group**: Choose an existing one or create a new one.
     - **Name**: Give your app a unique name.
     - **Publish**: Select **Code**.
     - **Runtime stack**: Choose **Java 17** (or the version your app is using).
     - **Operating System**: Select **Linux**.
     - **Region**: Choose the nearest region to your users.
   - **App Service Plan**: Create a new plan or select an existing one.
   - Click **Review + Create** and then **Create**.

## Step 4: Configure Deployment from GitHub

1. **Navigate to Your App Service**:
   - Once your App Service is created, go to the resource.

2. **Deployment Center**:
   - In the left menu, click on **Deployment Center**.
   - Choose **GitHub** as the source.
   - **Authorize Azure**: If prompted, authorize Azure to access your GitHub account.
   - **Select Repository**:
     - Choose the organization, repository, and branch you want to deploy from.
   - **Build Provider**: Select **GitHub Actions**.

3. **Configure Continuous Deployment**:
   - Azure will generate a workflow file in your GitHub repository.
   - Review the YAML file and click **Finish**. This file will handle the build and deployment process.

## Step 5: Configure Application Settings

1. **Application Settings**:
   - In your App Service, go to **Configuration**.
   - Add any necessary environment variables (e.g., database connection strings).

## Step 6: Test Your Deployment

1. **Push Changes**: Make any changes to your code and push them to your GitHub repository. This should trigger the GitHub Actions workflow you set up in the previous steps.

2. **Monitor Deployment**: You can monitor the deployment process in the **Actions** tab of your GitHub repository.

3. **Access Your Application**: Once deployment is complete, you can access your application using the URL provided in the Azure portal under your App Service.

## Additional Resources
- [Azure App Service Documentation](https://docs.microsoft.com/en-us/azure/app-service/)
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
