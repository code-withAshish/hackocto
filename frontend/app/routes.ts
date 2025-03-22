import { type RouteConfig, index, route } from "@react-router/dev/routes";

export default [
  index("routes/home.tsx"),
  route("dashboard", "routes/dashboard.tsx"),
  route("verify", "routes/verify.tsx"),
  route("auth", "routes/auth.tsx"),
] satisfies RouteConfig;
