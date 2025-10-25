var app = angular.module('doctorApp', []);

app.controller('AdminController', function($scope) {
  // Sample Doctors
  $scope.doctors = [
    { name: 'Dr. Smith', specialization: 'Cardiologist' },
    { name: 'Dr. Brown', specialization: 'Dermatologist' }
  ];

  // Sample Appointments
  $scope.appointments = [
    { patient: 'John Doe', doctor: 'Dr. Smith', date: new Date('2025-09-12T10:00:00') },
    { patient: 'Alice Johnson', doctor: 'Dr. Brown', date: new Date('2025-09-13T15:30:00') }
  ];

  $scope.newDoctor = {};
  $scope.newAppointment = {};

  // Doctor management
  $scope.addDoctor = function() {
    if ($scope.newDoctor.name && $scope.newDoctor.specialization) {
      $scope.doctors.push({
        name: $scope.newDoctor.name,
        specialization: $scope.newDoctor.specialization
      });
      $scope.newDoctor = {};
    }
  };

  $scope.deleteDoctor = function(index) {
    $scope.doctors.splice(index, 1);
  };

  // Appointment management
  $scope.addAppointment = function() {
    if ($scope.newAppointment.patient && $scope.newAppointment.doctor && $scope.newAppointment.date) {
      $scope.appointments.push({
        patient: $scope.newAppointment.patient,
        doctor: $scope.newAppointment.doctor,
        date: new Date($scope.newAppointment.date)
      });
      $scope.newAppointment = {};
    }
  };

  $scope.deleteAppointment = function(index) {
    $scope.appointments.splice(index, 1);
  };
});
