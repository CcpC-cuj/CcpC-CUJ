# CCPC Form Submission App

## How to Run

1. Clone the repository.

2. Create a `.env` file in the project root with your credentials:

```env
MAIL_USERNAME=your_email@gmail.com
MAIL_PASSWORD=your_app_password
```

3. Run the application:

```bash
mvn spring-boot:run
```

The app will start on `http://localhost:8080` and automatically send submitted forms to the admin email.
