import { Calendar, Download, FileText } from "lucide-react";
import {
  Card,
  CardContent,
  CardFooter,
  CardHeader,
} from "~/components/ui/card";
import { Button } from "~/components/ui/button";
import { Badge } from "~/components/ui/badge";

interface DocumentCardProps {
  title: string;
  institution: string;
  date: string;
  type: string;
}

export function DocumentCard({
  title,
  institution,
  date,
  type,
}: DocumentCardProps) {
  return (
    <Card>
      <CardHeader className="p-4 pb-2">
        <div className="flex items-start justify-between">
          <div className="flex items-center gap-2">
            <FileText className="h-4 w-4 text-muted-foreground" />
            <h3 className="font-semibold text-sm">{title}</h3>
          </div>
          <Badge variant="outline" className="text-xs">
            {type}
          </Badge>
        </div>
      </CardHeader>
      <CardContent className="p-4 pt-0 pb-2">
        <div className="text-xs text-muted-foreground">{institution}</div>
        <div className="flex items-center gap-1 mt-1 text-xs text-muted-foreground">
          <Calendar className="h-3 w-3" />
          <span>{date}</span>
        </div>
      </CardContent>
      <CardFooter className="p-4 pt-2">
        <Button variant="outline" size="sm" className="w-full">
          <Download className="h-3 w-3 mr-1" />
          Download
        </Button>
      </CardFooter>
    </Card>
  );
}
