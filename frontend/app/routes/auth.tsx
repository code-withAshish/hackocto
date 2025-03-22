import { Button } from "~/components/ui/button";
import { Input } from "~/components/ui/input";
import { Card, CardContent, CardHeader, CardTitle } from "~/components/ui/card";

export default function AuthPage() {
  return (
    <div className="flex h-screen w-full">
      {/* Left Side: Authentication Form */}
      <div className="flex w-1/2 items-center justify-center bg-white p-8">
        <Card className="w-full max-w-md shadow-xl p-6">
          <CardHeader>
            <CardTitle className="text-2xl font-bold text-center">
              Welcome Back
            </CardTitle>
            <p className="text-center text-gray-500">Sign in to continue</p>
          </CardHeader>
          <CardContent>
            <div className="space-y-4">
              <Input
                placeholder="Email"
                type="email"
                className="h-12 text-lg"
              />
              <Input
                placeholder="Password"
                type="password"
                className="h-12 text-lg"
              />
              <Button className="w-full h-12 text-lg">Sign In</Button>
              <p className="text-center text-sm text-gray-500">
                Don't have an account?{" "}
                <a href="#" className="text-blue-500">
                  Sign Up
                </a>
              </p>
            </div>
          </CardContent>
        </Card>
      </div>

      {/* Right Side: Motivational Quote */}
      <div className="flex w-1/2 items-center justify-center bg-slate-900 text-white p-12">
        <blockquote className="text-3xl font-semibold italic text-center max-w-md">
          "Education is the passport to the future, for tomorrow belongs to
          those who prepare for it today."
        </blockquote>
      </div>
    </div>
  );
}
