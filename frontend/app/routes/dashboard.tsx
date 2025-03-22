import {
  Award,
  BookOpen,
  FileText,
  GraduationCap,
  Home,
  School,
  Settings,
  User,
} from "lucide-react";
import {
  Sidebar,
  SidebarContent,
  SidebarFooter,
  SidebarGroup,
  SidebarGroupContent,
  SidebarGroupLabel,
  SidebarHeader,
  SidebarMenu,
  SidebarMenuButton,
  SidebarMenuItem,
  SidebarProvider,
  SidebarTrigger,
} from "~/components/ui/sidebar";
import { Avatar, AvatarFallback, AvatarImage } from "~/components/ui/avatar";
import { Button } from "~/components/ui/button";
import { Card, CardContent, CardHeader, CardTitle } from "~/components/ui/card";
import { DocumentCard } from "~/components/custom/document-card";

const menuItems = [
  { icon: Home, label: "Home" },
  { icon: Award, label: "Certificates" },
  { icon: FileText, label: "Documents" },
  { icon: School, label: "Colleges" },
];

const accountItems = [
  { icon: User, label: "Profile" },
  { icon: Settings, label: "Settings" },
];

const stats = [
  {
    title: "Total Certificates",
    value: 12,
    description: "From 3 different institutions",
    icon: Award,
  },
  {
    title: "Total Documents",
    value: 24,
    description: "Transcripts, applications, etc.",
    icon: FileText,
  },
  {
    title: "Colleges",
    value: 3,
    description: "Connected institutions",
    icon: School,
  },
];

const documents = [
  {
    title: "Academic Transcript",
    institution: "Stanford University",
    date: "May 2023",
    type: "Transcript",
  },
  {
    title: "Course Completion",
    institution: "MIT",
    date: "January 2023",
    type: "Certificate",
  },
  {
    title: "Enrollment Verification",
    institution: "Harvard University",
    date: "October 2022",
    type: "Verification",
  },
];

export default function DashboardPage() {
  return (
    <SidebarProvider>
      <div className="flex min-h-screen w-full bg-muted/40">
        <Sidebar>
          <SidebarHeader className="flex items-center gap-2 px-4 py-2">
            <GraduationCap className="h-6 w-6" />
            <span className="font-bold text-lg">EduPortal</span>
          </SidebarHeader>
          <SidebarContent>
            {[
              { label: "Dashboard", items: menuItems },
              { label: "Account", items: accountItems },
            ].map((group) => (
              <SidebarGroup key={group.label}>
                <SidebarGroupLabel>{group.label}</SidebarGroupLabel>
                <SidebarGroupContent>
                  <SidebarMenu>
                    {group.items.map(({ icon: Icon, label }) => (
                      <SidebarMenuItem key={label}>
                        <SidebarMenuButton tooltip={label}>
                          <Icon className="h-4 w-4" />
                          <span>{label}</span>
                        </SidebarMenuButton>
                      </SidebarMenuItem>
                    ))}
                  </SidebarMenu>
                </SidebarGroupContent>
              </SidebarGroup>
            ))}
          </SidebarContent>
          <SidebarFooter className="p-4 flex items-center gap-2">
            <Avatar>
              <AvatarImage
                src="/placeholder.svg?height=40&width=40"
                alt="Student"
              />
              <AvatarFallback>JS</AvatarFallback>
            </Avatar>
            <div>
              <span className="text-sm font-medium">John Smith</span>
              <span className="text-xs text-muted-foreground">
                Student ID: 12345
              </span>
            </div>
          </SidebarFooter>
        </Sidebar>

        <div className="flex-1">
          <header className="flex h-14 lg:h-16 items-center gap-4 border-b bg-background px-4 lg:px-6">
            <SidebarTrigger />
            <h1 className="text-lg font-semibold">Student Dashboard</h1>
            <Button variant="outline" size="sm">
              <BookOpen className="mr-2 h-4 w-4" /> Learning Portal
            </Button>
          </header>

          <main className="flex-1 p-4 md:p-6 lg:p-8">
            <div className="grid gap-4 md:grid-cols-2 lg:grid-cols-4">
              {stats.map(({ title, value, description, icon: Icon }) => (
                <Card key={title}>
                  <CardHeader className="flex flex-row items-center justify-between">
                    <CardTitle className="text-sm font-medium">
                      {title}
                    </CardTitle>
                    <Icon className="h-4 w-4 text-muted-foreground" />
                  </CardHeader>
                  <CardContent>
                    <div className="text-2xl font-bold">{value}</div>
                    <p className="text-xs text-muted-foreground">
                      {description}
                    </p>
                  </CardContent>
                </Card>
              ))}
            </div>
            <h3 className="text-lg font-semibold mt-6">Recent Documents</h3>
            <div className="grid gap-4 md:grid-cols-3">
              {documents.map((doc, i) => (
                <DocumentCard key={i} {...doc} />
              ))}
            </div>
          </main>
        </div>
      </div>
    </SidebarProvider>
  );
}
