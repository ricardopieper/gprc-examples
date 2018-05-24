setlocal

@rem enter this directory
cd /d %~dp0

set TOOLS_PATH=C:\Users\Pichau\.nuget\packages\grpc.tools\1.12.0\tools\windows_x86

%TOOLS_PATH%\protoc.exe -I../Protos --csharp_out . ../Protos/SumService.proto --grpc_out . --plugin=protoc-gen-grpc=%TOOLS_PATH%\grpc_csharp_plugin.exe

endlocal 