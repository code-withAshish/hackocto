// SPDX-License-Identifier: MIT
pragma solidity ^0.8.7;

contract CertificateRegistry {
    struct Certificate {
        string studentName;
        string course;
        uint256 dateIssued;
    }

    mapping(string => Certificate) public certificates;

    function issueCertificate(string memory studentId, string memory studentName, string memory course) public {
        certificates[studentId] = Certificate(studentName, course, block.timestamp);
    }

    function verifyCertificate(string memory studentId) public view returns (string memory, string memory, uint256) {
        Certificate memory cert = certificates[studentId];
        return (cert.studentName, cert.course, cert.dateIssued);
    }
}
