# **Dinemate - University Dining Hall Employee Management System**

Dinemate is a comprehensive university dining hall employee management system designed to streamline the process of managing employees, their tasks, and access privileges. It consists of three microservices: Login Service, Employee Management Service, and Employee Service.

## Microservices Overview

### 1. Login Service
The Login Service handles employee credential management, authentication, roles, and access privilege management. It provides endpoints for user authentication and authorization, allowing access control based on defined roles.

#### Endpoints:
- `/loginservice/api/v1/login`: Authenticates users and generates access tokens.

### 2. Employee Management Service
The Employee Management Service is responsible for employee onboarding, which includes adding new users, updating personal information of current employees, and managing employee records for resigned or terminated employees.

#### Endpoints:
- `/employeeservice/api/v1/employee/{empId}`: Gives the information for existing employee.
- `/employeeservice/api/v1/addEmployee`: Adds new employees to the system.

### 3. Employee Service
The Employee Service handles all tasks related to employee task management, scheduling, and shift management. It provides endpoints for scheduling employees, adding and dropping shifts, and managing task assignments. Sub binder is a functionality available for employees to add a shift if they can't work on their shift. An employee can add the shift to his schedule if it is available on sub binder. This is a temporary adding and dropping shifts functionality.

#### Endpoints:
- `/employeeservice/api/v1` - below endpoints will be appended after these service details
    - `/getScheduleById`: Gives schedule for the selected employee.
    - `/getScheduleByDate`: Gets a schedule for the given date. This includes all the shifts and employees working on those shifts for that date.
    - `/getScheduleByIdAndDate`: Gets a schedule for an employee on given date.
    - `/getAvailableScheduleForSubbinder`: Gets all the shifts added to the sub binder.
    - `/getAvailableShifts`: Get available shifts in the schedule.
    - `/getShiftByEmpId`: Get the shift details for an employee.
    - `/addToSubBinder/{scheduleId}`: Add a shift to sub binder.
    - `/pickFromSubBinder`: Pick a shift from sub binder.
    - `/dropShift/{shiftId}`: Drops a selected shift for employee.
    - `/addShift`: Adds shifts for employee.
    - `/assignTask`: Assigning task to employees for a particular shift.

## Deployment
Each microservice is packaged as a JAR file and can be deployed independently. The project is Maven-based, allowing for easy dependency management and build automation. The JAR files can be executed from the terminal using standard JAR file run commands.

## Integration
The integration between the UI and backend is achieved through API calls. The frontend interacts with the microservices by making HTTP requests to the defined endpoints, enabling seamless communication and data exchange.

## Getting Started
To deploy and run the Dinemate system, follow these steps:

1. Clone the repository from GitHub.
2. Build each microservice using Maven.
3. Deploy the JAR files for each microservice to your preferred environment.
4. Configure the frontend to make API calls to the appropriate endpoints.
5. Start using Dinemate to efficiently manage university dining hall employees.
