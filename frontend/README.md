# Certificate Issuance & Verification Frontend

## Overview

Welcome to the frontend repository of the **Certificate Issuance & Verification System**. This project leverages **React Router v7** (formerly Remix) and **shadcn/ui** to provide a seamless and modern user experience. The application is structured to ensure scalability, maintainability, and ease of development, especially for those new to React.

## Project Structure

```
frontend/
├── app/
│   ├── components/
│   │   ├── ui/           # shadcn/ui components
│   │   └── custom/       # Custom components developed by our team
│   ├── hooks/            # Hooks provided by shadcn
│   ├── lib/              # Utilities from shadcn and other sources
│   ├── routes/           # Main route pages
│   └── routes.tsx        # Route configuration
├── public/               # Static assets
├── package.json          # Project dependencies and scripts
└── README.md             # Project documentation
```

## Getting Started

### Prerequisites

- **Node.js**: Ensure you have Node.js installed (version 14 or higher recommended).
- **Package Manager**: Use either npm or yarn for managing dependencies.

### Installation

1. **Clone the Repository**:

   ```bash
   git clone <repository-url>
   cd frontend
   ```

2. **Install Dependencies**:

   If you're using npm:

   ```bash
   npm install
   ```


### Running the Application

To start the development server:

```bash
npm run dev
```

This will launch the application, typically accessible at `http://localhost:5173`.

## Routing with React Router v7

React Router v7, which integrates features from Remix, offers a file-based routing system. Here's how routing is set up in this project:

1. **Route Configuration**:

   Routes are defined in the `app/routes.tsx` file using the `RouteConfig` type:

   ```tsx
   import { type RouteConfig, index, route } from "@react-router/dev/routes";

   export default [
     index("routes/home.tsx"),
     route("dashboard", "routes/dashboard.tsx"),
     route("verify", "routes/verify.tsx"),
     route("auth", "routes/auth.tsx"),
   ] satisfies RouteConfig;
   ```

   Each route points to a corresponding component in the `app/routes/` directory.

2. **Creating a New Route**:

   To add a new page:

   - Create a new file in the `app/routes/` directory, e.g., `profile.tsx`.
   - Define the route in `routes.tsx`:

     ```tsx
     route("profile", "routes/profile.tsx"),
     ```

   This setup ensures that each route is associated with its respective component, promoting a clear and organized structure.

## Integrating shadcn/ui

**shadcn/ui** is a component library that combines the flexibility of Tailwind CSS with the modularity of component-based design. Here's how to integrate and use it:

1. **Installation**:

   Follow the manual installation guide to set up shadcn/ui in your project. citeturn0search3

2. **Adding Components**:

   After installation, you can start adding components. For example, to add a button component:

   ```bash
   npx shadcn-ui add button
   ```

   This will generate the button component inside the `app/components/ui/` directory.

3. **Using Components**:

   Import and use the shadcn/ui components in your pages or other components:

   ```tsx
   import { Button } from "~/components/ui/button";

   function Example() {
     return <Button>Click Me</Button>;
   }
   ```

## Learning Resources

For developers new to React and the tools used in this project, here are some resources to get you started:

- **React Documentation**: [React Docs](https://react.dev/learn)
- **React Router v7 Guide**: [React Router v7](https://reactrouter.com/en/main)
- **shadcn/ui Introduction**: [shadcn/ui Docs](https://ui.shadcn.com/docs)

## Contribution Guidelines

To maintain code quality and consistency:

- **Code Formatting**: Use Prettier for code formatting. Ensure your code is formatted before committing.
- **Linting**: ESLint is set up for this project. Run lint checks and address any issues before pushing code.
- **Branching Strategy**: Follow the Gitflow workflow. Create feature branches for new features and bug fixes.
- **Pull Requests**: Ensure all checks pass and request a review from at least one team member.

---

Happy coding! If you have any questions or need further assistance, feel free to reach out to the team lead. 