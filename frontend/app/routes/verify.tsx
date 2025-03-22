import { Search } from "lucide-react";
import { Input } from "~/components/ui/input";
import { Button } from "~/components/ui/button";

export default function CertificateVerification() {
  return (
    <div className="flex min-h-screen items-center justify-center bg-muted/40 px-6">
      <div className="text-center w-full max-w-4xl">
        <h1 className="text-5xl font-bold text-primary">
          Certificate Verification
        </h1>
        <p className="text-lg text-muted-foreground mt-2">
          Enter the certificate hash below to verify its authenticity.
        </p>
        <div className="mt-8 flex items-center justify-center">
          <div className="relative w-full max-w-3xl">
            <Input
              type="text"
              placeholder="Enter certificate hash..."
              className="w-full h-16 text-lg px-6 pr-14 rounded-xl shadow-md border border-gray-300 focus:ring-2 focus:ring-primary"
            />
            <Button
              variant="default"
              size="lg"
              className="absolute top-1/2 right-2 transform -translate-y-1/2 px-6 h-12"
            >
              <Search className="h-5 w-5" />
            </Button>
          </div>
        </div>
      </div>
    </div>
  );
}
