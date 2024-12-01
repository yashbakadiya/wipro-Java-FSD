# Django Blog and User Authentication Project

This project is a web application built with Django, featuring a blog and user authentication system. It allows users to register, log in, reset passwords, and manage profiles, along with creating and viewing blog posts.

---

## Features

- **User Authentication**: 
  - Register, login, and logout.
  - Password reset functionality with email confirmation.
  - Profile management.

- **Blog**: 
  - Separate app for blog-related routes and functionality.
  - Easily extendable for creating, editing, and viewing blog posts.

---

## Project Structure

### Main URL Configuration (`urls.py`)

The project routes are configured as follows:
- **Admin Panel**: Accessible at `/admin/`.
- **User Authentication**:
  - **Registration**: `/register/`
  - **Login**: `/login/`
  - **Logout**: `/logout/`
  - **Profile**: `/profile/`
  - **Password Reset**:
    - Start: `/password-reset/`
    - Confirmation: `/password-reset-confirm/<uidb64>/<token>/`
    - Success message: `/password-reset/done/`
- **Blog**: URL patterns are included from the `blog` app.

---

## Getting Started

Follow these instructions to set up and run the project on your local machine.

### Prerequisites

Ensure you have the following installed:
- Python (3.x recommended)
- Django (4.x or later)
- pip (Python package manager)

### Installation

1. **Clone the repository**:
    ```bash
    git clone <repository-url>
    cd <repository-name>
    ```

2. **Create a virtual environment**:
    ```bash
    python -m venv venv
    source venv/bin/activate  # On Windows: venv\Scripts\activate
    ```

3. **Install dependencies**:
    ```bash
    pip install -r requirements.txt
    ```

4. **Apply migrations**:
    ```bash
    python manage.py migrate
    ```

5. **Run the development server**:
    ```bash
    python manage.py runserver
    ```

6. **Access the application**:
    Open your browser and navigate to `http://127.0.0.1:8000`.

---

## File Structure

Here's an overview of the key files and directories:

