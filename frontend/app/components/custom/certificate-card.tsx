import { Download, ExternalLink } from "lucide-react";
import {
  Card,
  CardContent,
  CardFooter,
  CardHeader,
} from "~/components/ui/card";
import { Button } from "~/components/ui/button";
import { Badge } from "~/components/ui/badge";

interface CertificateCardProps {
  title: string;
  institution: string;
  date: string;
  type: string;
  logo: string;
}

export function CertificateCard({
  title,
  institution,
  date,
  type,
  logo,
}: CertificateCardProps) {
  return (
    <Card className="overflow-hidden">
      <CardHeader className="p-4 pb-0 flex flex-row items-start gap-2">
        <div className="w-10 h-10 rounded-md overflow-hidden flex-shrink-0 bg-muted">
          <img
            src={logo || "/placeholder.svg"}
            alt={institution}
            className="w-full h-full object-cover"
          />
        </div>
        <div className="flex-1">
          <h3 className="font-semibold text-sm line-clamp-2">{title}</h3>
          <p className="text-xs text-muted-foreground">{institution}</p>
        </div>
      </CardHeader>
      <CardContent className="p-4 pt-2">
        <div className="flex items-center justify-between">
          <Badge variant="outline" className="text-xs">
            {type}
          </Badge>
          <span className="text-xs text-muted-foreground">{date}</span>
        </div>
      </CardContent>
      <CardFooter className="p-4 pt-0 flex justify-between gap-2">
        <Button variant="outline" size="sm" className="w-full">
          <Download className="h-3 w-3 mr-1" />
          Download
        </Button>
        <Button variant="outline" size="sm" className="w-full">
          <ExternalLink className="h-3 w-3 mr-1" />
          View
        </Button>
      </CardFooter>
    </Card>
  );
}
