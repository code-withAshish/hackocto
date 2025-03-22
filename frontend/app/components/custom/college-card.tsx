import { ExternalLink, FileText, MapPin } from "lucide-react";
import {
  Card,
  CardContent,
  CardFooter,
  CardHeader,
} from "~/components/ui/card";
import { Button } from "~/components/ui/button";

interface CollegeCardProps {
  name: string;
  location: string;
  documents: number;
  logo: string;
}

export function CollegeCard({
  name,
  location,
  documents,
  logo,
}: CollegeCardProps) {
  return (
    <Card>
      <CardHeader className="p-4 pb-2 flex flex-row items-center gap-3">
        <div className="w-12 h-12 rounded-md overflow-hidden flex-shrink-0 bg-muted">
          <img
            src={logo || "/placeholder.svg"}
            alt={name}
            className="w-full h-full object-cover"
          />
        </div>
        <div>
          <h3 className="font-semibold">{name}</h3>
          <div className="flex items-center gap-1 text-xs text-muted-foreground">
            <MapPin className="h-3 w-3" />
            <span>{location}</span>
          </div>
        </div>
      </CardHeader>
      <CardContent className="p-4 pt-2 pb-2">
        <div className="flex items-center gap-1 text-sm">
          <FileText className="h-4 w-4 text-muted-foreground" />
          <span>{documents} documents</span>
        </div>
      </CardContent>
      <CardFooter className="p-4 pt-2">
        <Button variant="outline" size="sm" className="w-full">
          <ExternalLink className="h-3 w-3 mr-1" />
          View College
        </Button>
      </CardFooter>
    </Card>
  );
}
